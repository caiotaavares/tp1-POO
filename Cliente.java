import java.time.LocalDate;

public class Cliente extends Usuario {
    protected LocalDate dataCadastro;

    public Cliente(int codigoUsuario, String nome, String cpf, String rg, LocalDate dataNascimento, String cep, String telefone, String email, LocalDate dataCadastro) {
        super(codigoUsuario, nome, cpf, rg, dataNascimento, cep, telefone, email);
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataCadastro=" + dataCadastro +
                ", CodigoUsuario=" + CodigoUsuario +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", cep='" + cep + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
