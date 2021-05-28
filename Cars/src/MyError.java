public class MyError extends Exception {
    private String message;

    public MyError() {
        setMessage("Машина не завелась");
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}