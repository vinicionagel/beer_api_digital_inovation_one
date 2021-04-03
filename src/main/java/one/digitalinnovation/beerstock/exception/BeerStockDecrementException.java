package one.digitalinnovation.beerstock.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockDecrementException extends Exception {

    public BeerStockDecrementException(Long id, int quantidadeEmEstoque) {
        super(String.format("With the removal of beer with the id %s it was left with negative stock, quantity in stock %s", id, quantidadeEmEstoque));
    }
}
