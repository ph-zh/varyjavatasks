// Дополните класс для проверки возраста пользователя
public class AgeValidationRule ... {

public AgeValidationRule(Byte age) {
    super(age, "Возраст для подачи на ипотеку должен быть старше 18 лет");
}

@Override
public boolean isValid() {
    return value >= 18;
}

}