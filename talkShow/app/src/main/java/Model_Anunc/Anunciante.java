package Model_Anunc;

import java.util.Date;

/**
 * Created by root on 31/03/15.
 */
public class Anunciante {

    private String nome;
    private String end;
    private char sexo;
    private String cpf;
    private Date dtNasc;
    private String login;
    private String senha;

    public Anunciante(String nome, String end, char sexo, String cpf, Date dtNas, String login, String senha) {

        nome = nome;
        end = end;
        sexo = sexo;
        cpf = cpf;
        dtNasc = dtNasc;
        login = login;
        senha = senha;

    }
}