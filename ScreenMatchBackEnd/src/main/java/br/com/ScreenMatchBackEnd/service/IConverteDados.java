package br.com.ScreenMatchBackEnd.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
