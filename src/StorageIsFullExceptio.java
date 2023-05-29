public class StorageIsFullExceptio extends RuntimeException {
    public StorageIsFullExceptio() {
    }

    public StorageIsFullExceptio(String message) {
        super(message);
    }

    public StorageIsFullExceptio(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullExceptio(Throwable cause) {
        super(cause);
    }

    public StorageIsFullExceptio(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
