package lt.vtmc.praktiniai.users;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
//        int count = 0;
//        for (User user : users) {
//            if (user.getAge() > 25) {
//                count++;
//            }
//        }
//        return count;

        return (int) users.stream().filter(user -> user.getAge() > 25).count();
    }

    public static double getAverageAge(List<User> users) {
//        int sum = 0;
//        int count = 0;
//        for (User user : users) {
//            count++;
//            sum += user.getAge();
//        }
//        return (double) sum / count;

        return users.stream().mapToInt(User::getAge).average().orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
//        int minAge = users.get(0).getAge();
//        for (User user : users) {
//            if (user.getAge() < minAge) {
//                minAge = user.getAge();
//            }
//        }
//        return minAge;

    return users.stream().mapToInt(User::getAge).min().orElse(0);
    }

    public static User findByName(List<User> users, String name) {
//        for (User user : users) {
//            if (name.equals(user.getName())) {
//                return user;
//            }
//        }
//        return null;

        return users.stream().filter(u -> u.getName() == name).findFirst().orElse(null);
    }

    public static List<User> sortByAge(List<User> users) {
//        Collections.sort(users, new AgeComparator());
//        return users;

        return users.stream().sorted(Comparator.comparing(u -> u.getAge())).collect(Collectors.toList());
    }

    public static User findOldest(List<User> users) {
//        int maxAge = users.get(0).getAge();
//        int index = 0;
//        for (int i = 0; i < users.size(); i++) {
//            if (users.get(i).getAge() > maxAge) {
//                maxAge = users.get(i).getAge();
//                index = i;
//            }
//        }
//        return users.get(index);

        return users.stream().max(Comparator.comparing(u -> u.getAge())).orElse(null);
    }

    public static int sumAge(List<User> users) {
//        int sum = 0;
//        for (User user : users) {
//            sum += user.getAge();
//        }
//        return sum;

        return users.stream().mapToInt(User::getAge).sum();
    }

}
