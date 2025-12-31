public class PasswordChecker {

    public static String checkStrength(String password) {
        int score = 0;

        if (password.length() >= 8) score += 2;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()].*")) score += 2;

        if (score >= 7) return "STRONG";
        else if (score >= 4) return "MEDIUM";
        else return "WEAK";
    }
}
