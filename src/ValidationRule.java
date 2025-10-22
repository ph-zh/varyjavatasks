// Дополните базовый класс для всех правил валидации
public abstract class ValidationRule<Object> {
    protected final Object value;
    private final String errorMessage;

    protected ValidationRule(Object value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public abstract boolean isValid();

    public String getErrorMessage() {
        return errorMessage;
    }

}