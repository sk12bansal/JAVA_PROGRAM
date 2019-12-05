package java_assignment;

import java.util.Objects;

public class UserExceptionHandling {
    static class MyException extends Exception {
        int code;

        MyException(int code) {
            this.code = code;
        }

        public String toString() {
            String msg = "";
            if (code == 1) {
                msg = "User input  name is not valid";
            } else if (code == 2) {
                msg = "User input  Age is not valid";
            } else if (code == 3) {
                msg = "User input arguments is not correct";
            } else if (code == 4) {
                msg = "User input Age is not meeting criteria";
            }
            return msg;
        }
    }

    public static void main(String []args) {
        int age;
        String name;
        try {
            if (args.length == 0 || args.length > 2) {
                throw new MyException(3);
            }
            name = args[0];
            if (!isValidName(name)) {
                throw new MyException(1);
            }
            age = Integer.parseInt(args[1]);
            if(age<18 || age > 60){
                throw new MyException(4);
            }
            System.out.println(name + " " + age);
        } catch (NumberFormatException e) {
            try {
                throw new MyException(2);
            } catch (MyException ageEx) {
                System.out.println(ageEx);
            }
        } catch (MyException myex) {
            System.out.println(myex);
        }
    }

    private static boolean isValidName(String name) {
        String regex = "^[a-zA-Z]*$";
        boolean flag = true;
        if (Objects.isNull(name)) {
            flag = false;
        } else if (name.isEmpty()) {
            flag = false;
        } else if (name.isBlank()) {
            flag = false;
        } else if (!name.matches(regex)) {
            flag = false;
        }
        return flag;
    }
}
