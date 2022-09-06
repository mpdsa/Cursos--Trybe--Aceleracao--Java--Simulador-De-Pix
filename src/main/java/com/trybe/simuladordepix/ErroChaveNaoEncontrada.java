package com.trybe.simuladordepix;

/** Classe ErroChaveNaoEncontrada. */
public class ErroChaveNaoEncontrada extends ErroDePix {
  private static final long serialVersionUID = 1L;

  public ErroChaveNaoEncontrada() {
    super(Mensagens.CHAVE_NAO_ENCONTRADA);
  }
}
