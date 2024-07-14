package com.rafacfrank.literalura_rafacfrank.service;

public interface IConverteDados {

    <T> T obterDados (String json, Class<T> classe);
}
