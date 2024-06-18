package dio.desafio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo{
    private LocalDate data;
    private final Enum<TipoConteudo> tipo = TipoConteudo.MENTORIA;

    public Enum<TipoConteudo> getTipo() {
        return tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
