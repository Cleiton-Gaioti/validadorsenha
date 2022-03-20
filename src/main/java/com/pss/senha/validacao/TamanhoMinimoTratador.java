package com.pss.senha.validacao;

final class TamanhoMinimoTratador extends TratadorSenha {

    @Override
    public String verificar(String senha) {
        if (senha.length() <= 6) {
            return "Senha deve ter mais que 6 caracteres;";
        }
        return "";
    }
    

}
