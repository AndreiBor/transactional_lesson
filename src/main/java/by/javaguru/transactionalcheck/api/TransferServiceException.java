package by.javaguru.transactionalcheck.api;

public class TransferServiceException extends RuntimeException {
    public TransferServiceException(Throwable cause) {
        super(cause);
    }

    public TransferServiceException(String message) {
        super(message);
    }
}
