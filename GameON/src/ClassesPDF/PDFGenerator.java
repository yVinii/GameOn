/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClassesPDF;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author mathe
 */
public class PDFGenerator {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        String url = "http://localhost:3030/";
        
        try {
            // Cria um objeto para representar os dados do JSON
            Campeonato campeonato = new Campeonato();
            campeonato.setCampeonatoNome("Campeonato Sorojaca");

            // Adiciona os times
            TimeResponsavel[] timeResponsavelArray = {
                    new TimeResponsavel("Criciúma", "Amaury Jr."),
                    new TimeResponsavel("Flamengo", "Jefferson"),
                    new TimeResponsavel("Corinthians", "Joaquim Barbosa"),
                    new TimeResponsavel("Grêmio", "Zacarias"),
                    new TimeResponsavel("Seleção de Marrocos", "Zintz"),
                    new TimeResponsavel("Palmeiras", "Michael Mayers"),
                    new TimeResponsavel("Barcelona", "Vinicius")
            };
            campeonato.setTimes(timeResponsavelArray);

            // Adiciona as partidas à lista de partidas do campeonato
            List<Partidas> partidasList = new ArrayList<>();

            Partidas partida1 = new Partidas(new TimeGols[] {
                new TimeGols("Criciúma", "3"),
                new TimeGols("Flamengo", "2")
            });

            partidasList.add(partida1);

            Partidas partida2 = new Partidas(new TimeGols[] {
                new TimeGols("Corinthians", "1"),
                new TimeGols("Botafogo", "1")
            });

            partidasList.add(partida2);
            // Adiciona as partidas à lista de partidas do campeonato
            campeonato.setPartidas(partidasList.toArray(new Partidas[partidasList.size()]));

            // Converte o objeto para JSON
            ObjectMapper objectMapper = new ObjectMapper();
            String json = objectMapper.writeValueAsString(campeonato);

            // Cria a conexão HTTP
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setDoOutput(true);

            // Envia o JSON no corpo da requisição
            try (OutputStream os = con.getOutputStream()) {
                byte[] input = json.getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Obtém a resposta da requisição
            int responseCode = con.getResponseCode();

            System.out.println("Código de resposta: " + responseCode);
            String jsonResponse = "";
            try (InputStream inputStream = con.getInputStream();
                 BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            jsonResponse = response.toString();
            }

            // Imprime a resposta JSON
            System.out.println("Resposta JSON: " + jsonResponse);
            
            // Analisa o JSON utilizando a biblioteca Jackson
            ObjectMapper finalMapper = new ObjectMapper();
            JsonNode jsonNode = finalMapper.readTree(jsonResponse);
            
            // Verifica se a propriedade "pdfURL" está presente no JSON
            if (jsonNode.has("pdfURL")) {
                String pdfURL = jsonNode.get("pdfURL").asText();
                System.out.println("URL do PDF: " + pdfURL);
            } else {
                System.out.println("A propriedade 'pdfURL' não está presente no JSON.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
