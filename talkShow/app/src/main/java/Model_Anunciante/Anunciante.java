package Model_Anunciante;

import java.util.Date;

/**
 * Created by arisimoes on 07/04/15.
 */
public class Anunciante {

    private String nome;
    private String sobrenome;
    private String endereco;
    private String cpf;
    private char sexo;
    private Date dataNascimento;
    private String login;
    private String senha;

public void Anunciante( String nome, String sobrenome, String endereco, String cpf, char sexo, Date dataNascimento, String login, String senha){

    this.nome = nome;
    this.sobrenome = sobrenome;
    this.endereco = endereco;
    this.cpf = cpf;
    this.sexo = sexo;
    this.dataNascimento = dataNascimento;
    this.login = login;
    this.senha = senha;

   }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }


}
