package main;

import static main.isDotNumberOrSymbol.isDotNumberOrSymbol;

public class isDotNumberOrSymbolTest {
    @Test
    public void isDotNumberOrSymbol_returnsString() {
    String value = isDotNumberOrSymbol('.');

    assertNotNull(value);

}
