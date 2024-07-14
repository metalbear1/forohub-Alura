package br.com.forumhub.forumhub.topico;

public record DadosListagemTopico(
        Long id,
        String titulo,
        String mensagem,
        String autor,
        String curso,
        Boolean estadoDoTopico,
        String dataCriacao
) {
    public DadosListagemTopico(Topico topico) {
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensagem(),
                topico.getAutor(),
                topico.getCurso(),
                topico.getEstadoDoTopico(),
                topico.getDataCriacao().toString()
                );
    }
}
