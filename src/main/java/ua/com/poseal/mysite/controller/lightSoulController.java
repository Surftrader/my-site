package ua.com.poseal.mysite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.poseal.mysite.exception.AppException;
import ua.com.poseal.mysite.model.Card;
import ua.com.poseal.mysite.model.Prediction;
import ua.com.poseal.mysite.service.PredictionService;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;

@Controller
@RequestMapping("/tarot")
public class lightSoulController {

    @Autowired
    private PredictionService predictionService;

    @GetMapping
    public String getTarotPage(Map<String, Object> model) {
        return "tarot";
    }

    @PostMapping
    public String getCards(
            @ModelAttribute("birthday") String birthday,
            Map<String, Object> model
    ) {

        try {
            LocalDate localDate = LocalDate.parse(birthday);

            Prediction prediction = predictionService.makePrediction(localDate);
            model.put("prediction", prediction);

            Card pos17 = prediction.getPos17();
            model.put("pos17", pos17);
            Card pos18 = prediction.getPos18();
            model.put("pos18", pos18);
            Card posK32 = prediction.getPosK32();
            model.put("posK32", posK32);
            Card pos19 = prediction.getPos19();
            model.put("pos19", pos19);
            Card pos20 = prediction.getPos20();
            model.put("pos20", pos20);
            Card pos16 = prediction.getPos16();
            model.put("pos16", pos16);
            Card posK31 = prediction.getPosK31();
            model.put("posK31", posK31);
            Card pos15 = prediction.getPos15();
            model.put("pos15", pos15);
            Card posR1 = prediction.getPosR1();
            model.put("posR1", posR1);
            Card pos9 = prediction.getPos9();
            model.put("pos9", pos9);
            Card pos10 = prediction.getPos10();
            model.put("pos10", pos10);
            Card posR3 = prediction.getPosR3();
            model.put("posR3", posR3);
            Card pos1 = prediction.getPos1();
            model.put("pos1", pos1);
            Card pos2 = prediction.getPos2();
            model.put("pos2", pos2);
            Card pos3 = prediction.getPos3();
            model.put("pos3", pos3);
            Card pos4 = prediction.getPos4();
            model.put("pos4", pos4);
            Card pos5 = prediction.getPos5();
            model.put("pos5", pos5);
            Card pos21 = prediction.getPos21();
            model.put("pos21", pos21);
            Card pos33 = prediction.getPos33();
            model.put("pos33", pos33);
            Card pos6 = prediction.getPos6();
            model.put("pos6", pos6);
            Card pos7a = prediction.getPos7a();
            model.put("pos7a", pos7a);
            Card pos7b = prediction.getPos7b();
            model.put("pos7b", pos7b);
            Card pos31 = prediction.getPos31();
            model.put("pos31", pos31);
            Card pos34 = prediction.getPos34();
            model.put("pos34", pos34);
            Card pos8 = prediction.getPos8();
            model.put("pos8", pos8);
            Card pos12 = prediction.getPos12();
            model.put("pos12", pos12);
            Card pos30 = prediction.getPos30();
            model.put("pos30", pos30);
            Card pos32 = prediction.getPos32();
            model.put("pos32", pos32);
            Card pos35 = prediction.getPos35();
            model.put("pos35", pos35);
            Card posA = prediction.getPosA();
            model.put("posA", posA);
            Card posK07 = prediction.getPosK07();
            model.put("posK07", posK07);
            Card posK12 = prediction.getPosK12();
            model.put("posK12", posK12);
            Card posB = prediction.getPosB();
            model.put("posB", posB);
            Card posC = prediction.getPosC();
            model.put("posC", posC);
            Card posD = prediction.getPosD();
            model.put("posD", posD);
            Card posE = prediction.getPosE();
            model.put("posE", posE);
            Card posF = prediction.getPosF();
            model.put("posF", posF);
            Card posT1 = prediction.getPosT1();
            model.put("posT1", posT1);
            Card posG1 = prediction.getPosG1();
            model.put("posG1", posG1);
            Card posG2 = prediction.getPosG2();
            model.put("posG2", posG2);
            Card posT2 = prediction.getPosT2();
            model.put("posT2", posT2);
            Card posH = prediction.getPosH();
            model.put("posH", posH);
            Card posI = prediction.getPosI();
            model.put("posI", posI);

            Card monthEnergy = prediction.getMonthEnergy();
            model.put("monthEnergy", monthEnergy);
            Card yearEnergy = prediction.getYearEnergy();
            model.put("yearEnergy", yearEnergy);
            Card monthBackground = prediction.getMonthBackground();
            model.put("monthBackground", monthBackground);
            Card dayEnergy1 = prediction.getDayEnergy1();
            model.put("dayEnergy1", dayEnergy1);
            Card dayEnergy2 = prediction.getDayEnergy2();
            model.put("dayEnergy2", dayEnergy2);
            Card dayEnergy3 = prediction.getDayEnergy3();
            model.put("dayEnergy3", dayEnergy3);

        } catch (DateTimeParseException e) {
            String errorDate = "Error message from message.properties";
            model.put("errorMessage", errorDate);
            return "error";

        } catch (AppException e) {
            return "error";
        }
        return "tarot";
    }

}
