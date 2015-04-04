package Model_Anunc;

import java.util.Date;

/**
 * Ari Sim&otilde;es
 */
class Anunciante {

    private String nome;
    private String sobreNome;
    private String end;
    private char sexo;
    private String cpf;
    private Date nasci;
    private String login;
    private String senha;

    public Anunciante(String nome, String sobreNome, String end, char sexo, String cpf, Date nasci, String login, String senha) {

        nome = nome;
        sobreNome = sobreNome;
        end = end;
        sexo = sexo;
        cpf = cpf;
        nasci = nasci;
        login = login;
        senha = senha;

    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public String getEnd() {
        return end;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Date getNasci() {
        return nasci;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }
}