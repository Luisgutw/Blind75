package Code;

import java.util.ArrayList;
import java.util.List;

public class ValidParantheses {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        } else {
            List<Character> checker = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                char crr = s.charAt(i);
                if (crr == '(' || crr == '{' || crr == '[') {
                    checker.add(crr);
                } else if (crr == ')') {
                    if (checker.size() - 1 < 0) {
                        return false;
                    }
                    if (checker.get(checker.size() - 1) != '(') {
                        return false;
                    } else {
                        checker.remove(checker.size() - 1);
                    }
                } else if (crr == '}') {
                    if (checker.size() - 1 < 0) {
                        return false;
                    }
                    if (checker.get(checker.size() - 1) != '{') {
                        return false;
                    } else {
                        checker.remove(checker.size() - 1);
                    }
                } else if (crr == ']') {
                    if (checker.size() - 1 < 0) {
                        return false;
                    }
                    if (checker.get(checker.size() - 1) != '[') {
                        return false;
                    } else {
                        checker.remove(checker.size() - 1);
                    }
                }
            }
            return (checker.size() == 0);
        }
    }
}
