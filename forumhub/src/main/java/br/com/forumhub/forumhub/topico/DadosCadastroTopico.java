package br.com.forumhub.forumhub.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,

        @NotBlank
        String mensagem,

//        @NotBlank
//        String autor,

        @NotBlank
        String curso
) {
}
