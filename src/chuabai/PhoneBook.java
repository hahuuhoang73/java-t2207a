package chuabai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();
    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p: PhoneList){
            if (p.name.equals(name)){
                if (p.phones.contains(phone)){
                    return;
                }
                p.phones.add(phone);
                return;
            }
        }
        PhoneNumber pn = new PhoneNumber(name,phone);
        PhoneList.add(pn);
    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p:PhoneList){
            if (p.name.equals(name)){
                PhoneList.remove(p);
                return;
            }
        }

    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        for (PhoneNumber p:PhoneList){
            if (p.name.equals(name)){
                p.phones.remove(oldPhone);
                p.phones.add(newPhone);
                return;
            }
        }

    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for (PhoneNumber p: PhoneList){
            if (p.name.equals(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.name.compareTo(o2.name);
            }
        });

    }
}
