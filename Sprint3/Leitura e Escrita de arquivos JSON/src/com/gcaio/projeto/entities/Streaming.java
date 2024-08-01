package com.gcaio.projeto.entities;

public enum Streaming {
    NETFLIX("Netflix"),
    AMAZON_PRIME("Amazon Prime"),
    HULU("Hulu"),
    DISNEY_PLUS("Disney+"),
    HBO_MAX("HBO Max"),
    APPLE_TV_PLUS("Apple TV+"),
    YOUTUBE_PREMIUM("YouTube Premium"),
    PARAMOUNT_PLUS("Paramount+"),
    PEACOCK("Peacock"),
    OUTRO("Outro");

    private final String descricao;

    Streaming(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
