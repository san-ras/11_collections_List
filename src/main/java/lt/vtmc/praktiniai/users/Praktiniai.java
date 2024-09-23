package lt.vtmc.praktiniai.users;

import java.util.Collections;
import java.util.List;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        int count = 0;
        for (User user : users) {
            if (user.getAge() > 25) {
                count++;
            }
        }
        return count;
    }

    public static double getAverageAge(List<User> users) {
        int sum = 0;
        int count = 0;
        for (User user : users) {
            count++;
            sum += user.getAge();
        }
        return (double) sum / count;
    }

    public static Integer getMinAge(List<User> users) {
        int minAge = users.get(0).getAge();
        for (User user : users) {
            if (user.getAge() < minAge) {
                minAge = user.getAge();
            }
        }
        return minAge;
    }

    public static User findByName(List<User> users, String name) {
        for (User user : users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    public static List<User> sortByAge(List<User> users) {
        Collections.sort(users, new AgeComparator());
        return users;
    }

    public static User findOldest(List<User> users) {
        int maxAge = users.get(0).getAge();
        int index = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAge() > maxAge) {
                maxAge = users.get(i).getAge();
                index = i;
            }
        }
        return users.get(index);
    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User user : users) {
            sum += user.getAge();
        }
        return sum;
    }

}
