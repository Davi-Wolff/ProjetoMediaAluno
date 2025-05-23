package model;

/**
 *
 * @author Davi Wolff
 */

public class Aluno {
    
    private String nome;
    private Double nota1, nota2, nota3;
    
    
    public Aluno(){
        
    }
    
    public Aluno(String nome, double nota1, double nota2, double nota3){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    
     public Double getMedia(){
        return ((getNota1() + getNota2() + getNota3())/3);
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome = " + nome + ", media = " + getMedia() + '}';
    }
     
     
     
}
