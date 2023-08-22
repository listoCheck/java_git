import java.util.ArrayList;
class People {
    public ArrayList<String> names = new ArrayList<>();
    Print p = new Print();
    public void worker(String name, String surname, String dols){
        names.add(name);
        names.add(surname);
        names.add(dols);

    }
    public void people(){
        for(int i = 0; i < names.size(); i += 3){
            String name = names.get(i), surname = names.get(i+1), dols = names.get(i+2);
            if (dols.equals("worker")) p.print("Worker: " + name + " " + surname);
            if (dols.equals("visitoe")) p.print("Visitor: " + name + " " + surname);
        }
    }
}
