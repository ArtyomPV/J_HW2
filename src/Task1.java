import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Task1 {

    public  StringBuilder getCondition(Map<String, String> params) {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (!pair.getValue().equals("null")) {
                if (result.toString().length() > 1) {
                    result.append(" and ");
                }
                result.append(pair.getKey())
                        .append(" = '")
                        .append(pair.getValue())
                        .append("'");
            }

        }
        return result;
    }

}
