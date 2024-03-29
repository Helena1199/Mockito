public class ManagerAfisha {

    private String[] films = new String[0];
    private int limit;

    public ManagerAfisha() {
        this.limit = 10;
    }

    public ManagerAfisha(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultlenght;
        if (films.length < limit) {
            resultlenght = films.length;
        } else {
            resultlenght = limit;
        }
        String[] tmp = new String[resultlenght];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;

    }
}
