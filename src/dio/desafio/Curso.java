package dio.desafio;
public class Curso extends Conteudo{

    private int cargaHoraria;
    private final Enum<TipoConteudo> tipo = TipoConteudo.CURSO;

    public Enum<TipoConteudo> getTipo() {
        return tipo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
