// Дополните класс для проверки трудоустроенности пользователя
public class EmploymentValidationRule ... {

public EmploymentValidationRule(Boolean value) {
    super(value, "Ипотека выдается только трудоустроенным");
}

@Override
public boolean isValid() {
    return value;
}
}