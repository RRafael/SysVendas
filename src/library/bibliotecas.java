package library;

import java.text.DecimalFormat;

public class bibliotecas {

    public boolean soContemNumeros(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String preencheCom(String linha_a_preencher, String letra, int tamanho, int direcao) {
        letra = "0";
        direcao = 1;
        tamanho = 3;
        //Checa se Linha a preencher é nula ou branco
        if (linha_a_preencher == null || linha_a_preencher.trim() == "") {
            linha_a_preencher = "";
        }

        //Enquanto Linha a preencher possuir 2 espaços em branco seguidos, substitui por 1 espaço apenas
        while (linha_a_preencher.contains(" ")) {
            linha_a_preencher = linha_a_preencher.replaceAll(" ", " ").trim();
        }

        //Retira caracteres estranhos
        linha_a_preencher = linha_a_preencher.replaceAll("[./-]", "");

        StringBuffer sb = new StringBuffer(linha_a_preencher);

        if (direcao == 1) { //a Esquerda

            for (int i = sb.length(); i < tamanho; i++) {

                sb.insert(0, letra);

            }

        } else if (direcao == 2) {//a Direita

            for (int i = sb.length(); i < tamanho; i++) {

                sb.append(letra);

            }

        }

        return sb.toString();

    }

    public String formatarFloat(float numero) {
        String retorno = "";
        DecimalFormat formatter = new DecimalFormat("#.00");
        try {
            retorno = formatter.format(numero);
        } catch (Exception ex) {
            System.err.println("Erro ao formatar numero: " + ex);
        }
        return retorno;
    }

    public boolean isNumericFloat(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
