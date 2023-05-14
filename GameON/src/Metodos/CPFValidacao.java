package Metodos;
public class CPFValidacao {
    public static boolean validarCPF(String cpf) {
        // Removendo caracteres não numéricos
        cpf = cpf.replaceAll("[^0-9]", "");

        // Verificando se o CPF possui 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verificando se todos os dígitos são iguais (CPF inválido)
        if (cpf.matches("(/d)/1{10}")) {
            return false;
        }

        // Calculando o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito > 9) {
            primeiroDigito = 0;
        }

        // Calculando o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito > 9) {
            segundoDigito = 0;
        }

        // Verificando se os dígitos verificadores estão corretos
        return cpf.endsWith(String.valueOf(primeiroDigito) + segundoDigito);
    }
}
