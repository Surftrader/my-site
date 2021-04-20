package ua.com.poseal.mysite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.poseal.mysite.model.Prediction;
import ua.com.poseal.mysite.repo.CardRepo;

import java.time.LocalDate;

@Service
public class PredictionService {

    private final CardRepo cardRepo;

    @Autowired
    public PredictionService(CardRepo cardRepo) {
        this.cardRepo = cardRepo;
    }

    public Prediction makePrediction(LocalDate localDate) {
        Prediction prediction = new Prediction();

        int day = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();

        int pos1 = normalizeNumber(day);
        prediction.setPos1(cardRepo.findByCardNumber(rightDigit(pos1)));
        int pos2 = normalizeNumber(month);
        prediction.setPos2(cardRepo.findByCardNumber(rightDigit(pos2)));
        int pos3 = summYear(year);
        prediction.setPos3(cardRepo.findByCardNumber(rightDigit(pos3)));
        int pos4 = normalizeNumber(pos1 + pos2);
        prediction.setPos4(cardRepo.findByCardNumber(rightDigit(pos4)));
        int pos5 = normalizeNumber(pos2 + pos3);
        prediction.setPos5(cardRepo.findByCardNumber(rightDigit(pos5)));
        int pos6 = normalizeNumber(pos4 + pos5);
        prediction.setPos6(cardRepo.findByCardNumber(rightDigit(pos6)));
        int pos7a = normalizeNumber(pos1 + pos5);
        prediction.setPos7a(cardRepo.findByCardNumber(rightDigit(pos7a)));
        int pos8 = normalizeNumber(pos2 + pos6);
        prediction.setPos8(cardRepo.findByCardNumber(rightDigit(pos8)));
        int pos12 = normalizeNumber(pos7a + pos8);
        prediction.setPos12(cardRepo.findByCardNumber(rightDigit(pos12)));
        int pos9 = normalizeNumber(pos1 - pos2);
        prediction.setPos9(cardRepo.findByCardNumber(rightDigit(pos9)));
        int pos10 = normalizeNumber(pos3 - pos2);
        prediction.setPos10(cardRepo.findByCardNumber(rightDigit(pos10)));
        int posK31 = normalizeNumber(pos9 - pos10);
        prediction.setPosK31(cardRepo.findByCardNumber(rightDigit(posK31)));

        int pos17 = normalizeNumber(posK31 + pos6);
        prediction.setPos17(cardRepo.findByCardNumber(rightDigit(pos17)));
        int pos18 = normalizeNumber(posK31 + pos8);
        prediction.setPos18(cardRepo.findByCardNumber(rightDigit(pos18)));
        int posK32 = normalizeNumber(
                normalizeNumber(pos9 + posK31) + pos10); // 22???
        prediction.setPosK32(cardRepo.findByCardNumber(rightDigit(posK32))); // null??
        int pos19 = normalizeNumber(pos4 + pos6);
        prediction.setPos19(cardRepo.findByCardNumber(rightDigit(pos19)));
        int pos20 = normalizeNumber(pos5 + pos6);
        prediction.setPos20(cardRepo.findByCardNumber(rightDigit(pos20)));
        int pos16 = normalizeNumber(
                normalizeNumber(
                        normalizeNumber(pos1 + pos4) + pos3) + pos5);
        // TODO: check
        // int pos16 = normalizeNumber(pos1 + pos4 + pos3 + pos5);
        prediction.setPos16(cardRepo.findByCardNumber(rightDigit(pos16)));
        int pos15 = normalizeNumber(
                normalizeNumber(
                        normalizeNumber(pos9 + pos10) + posK31) - pos7a);
        prediction.setPos15(cardRepo.findByCardNumber(rightDigit(pos15)));

        int posR1 = normalizeNumber(normalizeNumber(pos1 + pos4) + pos6);
        prediction.setPosR1(cardRepo.findByCardNumber(rightDigit(posR1)));
        int posR3 = normalizeNumber(normalizeNumber(pos3 + pos5) + pos6);
        prediction.setPosR3(cardRepo.findByCardNumber(rightDigit(posR3)));
        int pos7b = normalizeNumber(pos3 + pos4);
        prediction.setPos7b(cardRepo.findByCardNumber(rightDigit(pos7b)));
        int pos21 = normalizeNumber(
                normalizeNumber(
                        normalizeNumber(
                                normalizeNumber(
                                        normalizeNumber(pos1 + pos2) + pos3) + pos4) + pos5) + pos6);
        prediction.setPos21(cardRepo.findByCardNumber(rightDigit(pos21)));
        int posA = normalizeNumber(pos1 + pos4);
        prediction.setPosA(cardRepo.findByCardNumber(rightDigit(posA)));
        int posB = normalizeNumber(pos2 + pos4);
        prediction.setPosB(cardRepo.findByCardNumber(rightDigit(posB)));
        int posC = normalizeNumber(pos2 + pos5);
        prediction.setPosC(cardRepo.findByCardNumber(rightDigit(posC)));
        int posD = normalizeNumber(pos3 + pos5);
        prediction.setPosD(cardRepo.findByCardNumber(rightDigit(posD)));
        int posE = normalizeNumber(pos4 + pos6);
        prediction.setPosE(cardRepo.findByCardNumber(rightDigit(posE)));
        int posF = normalizeNumber(pos5 + pos6);
        prediction.setPosF(cardRepo.findByCardNumber(rightDigit(posF)));
        int posH = normalizeNumber(posA + posE);
        prediction.setPosH(cardRepo.findByCardNumber(rightDigit(posH)));
        int posG1 = normalizeNumber(posC + posD);
        prediction.setPosG1(cardRepo.findByCardNumber(rightDigit(posG1)));
        int posG2 = normalizeNumber(posB + posF);
        prediction.setPosG2(cardRepo.findByCardNumber(rightDigit(posG2)));
        int posI = normalizeNumber(posG1 + posG2);
        prediction.setPosI(cardRepo.findByCardNumber(rightDigit(posI)));
        int posT1 = normalizeNumber(normalizeNumber(posA + posB) + posD);
        prediction.setPosT1(cardRepo.findByCardNumber(rightDigit(posT1)));
        int posT2 = normalizeNumber(normalizeNumber(posA + posC) + posF);
        prediction.setPosT2(cardRepo.findByCardNumber(rightDigit(posT2)));
        int pos33 = normalizeNumber(posA - pos12);
        prediction.setPos33(cardRepo.findByCardNumber(rightDigit(pos33)));
        int pos34 = normalizeNumber(posA - posK31);
        prediction.setPos34(cardRepo.findByCardNumber(rightDigit(pos34)));
        int pos31 = normalizeNumber(
                normalizeNumber(day) + month + normalizeNumber(year));
        prediction.setPos31(cardRepo.findByCardNumber(rightDigit(pos31)));

        int pos32 = normalizeNumber(posA - pos10);
        prediction.setPos32(cardRepo.findByCardNumber(rightDigit(pos32)));
        int pos35 = normalizeNumber(posK32 - 10);                   // check 10 ???
        prediction.setPos35(cardRepo.findByCardNumber(rightDigit(pos35)));
        int posK07 = normalizeNumber(posK32 - pos7a);
        prediction.setPosK07(cardRepo.findByCardNumber(rightDigit(posK07)));
        int posK12 = normalizeNumber(posK32 - pos12);
        prediction.setPosK12(cardRepo.findByCardNumber(rightDigit(posK12)));
        int pos30 = normalizeNumber(pos12 * 2);
        prediction.setPos30(cardRepo.findByCardNumber(rightDigit(pos30)));

        LocalDate now = LocalDate.now();
        int dayNow = now.getDayOfMonth();
        int monthNow = now.getMonthValue();
        int yearNow = now.getYear();

        int dayEnergy1 = normalizeNumber(summ(day, dayNow)); // 00:00-12:00 (P1)
        prediction.setDayEnergy1(cardRepo.findByCardNumber(rightDigit(dayEnergy1)));

        int monthEnergy = normalizeNumber(month + monthNow); // (P2)
        prediction.setMonthEnergy(cardRepo.findByCardNumber(rightDigit(monthEnergy)));

        int yearEnergy = normalizeNumber(normalizeNumber(summYear(year)) + normalizeNumber(summYear(yearNow))); //(P3)
        prediction.setYearEnergy(cardRepo.findByCardNumber(rightDigit(yearEnergy)));

        int dayEnergy2 = normalizeNumber(dayEnergy1 + monthEnergy); // 12:00-18:00 (P4=P1+P2)
        prediction.setDayEnergy2(cardRepo.findByCardNumber(rightDigit(dayEnergy2)));

        int monthBackground = normalizeNumber(monthEnergy + yearEnergy); // (P5=P2+P3)
        prediction.setMonthBackground(cardRepo.findByCardNumber(rightDigit(monthBackground)));


        int dayEnergy3 = normalizeNumber(dayEnergy2 + monthBackground); // 18:00-00:00 (P6=P4+P5)
        prediction.setDayEnergy3(cardRepo.findByCardNumber(rightDigit(dayEnergy3)));

        return prediction;
    }

    private int rightDigit(int pos) {
        if (pos == 22) {
            return 0;
        }
        return pos;
    }

    private int summYear(int number) {

        String str = String.valueOf(number);
        int i = str.length();

        int result = 0;
        for (int j = 0; j < i; j++) {
            result += Integer.parseInt(String.valueOf(str.charAt(j)));
        }

        if (result == 0) {
            return 22;
        }
        if (result > 22) {
            return result - 22;
        }
        return result; // может выдать 22!!!
    }

    private int summ(int numberFirst, int numberSecond) {
        int result = numberFirst + numberSecond;
        if (result > 22) {
            int a = result - 22;
            while (a > 22) {
                a -= 22;
            }
            return a;
        }
        return result;
    }

    private int normalizeNumber(int i) {
        if (i < 0) {
            i = i * -1;
        }
        if (i == 0) {
            return 22;
        }
        if (i <= 22) {
            return i;
        }
        while (i > 22) {
            if (i < 45) {
                return i - 22;
            } else {
                i = i % 10 + i / 10;
            }
        }
        return i;
    }

}
