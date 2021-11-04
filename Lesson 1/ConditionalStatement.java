public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        boolean isMale = true;
        double height = 1.80;
        char firstLiteraOfName = 'I';

        if(age > 20) {
            System.out.println("Age more than 20");
        }

        if(isMale) {
            System.out.println("Sex is male");
        }

        if(!isMale) {
            System.out.println("Sex is not male");
        }

        if(height < 1.80) {
            System.out.println("Height is less than 1.80");
        } else {
            System.out.println("Height is not less than 1.80");
        }

        if(firstLiteraOfName == 'M') {
            System.out.println("First litera of name is \"M\"");
        } else if(firstLiteraOfName == 'I') {
            System.out.println("First litera of name is \"I\"");
        } else {
            System.out.println("I don't know what is the first litera of name");
        }
    }
}