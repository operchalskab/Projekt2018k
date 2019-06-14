package pl.edu.wszib.projekt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.thymeleaf.util.StringUtils;
import pl.edu.wszib.projekt.dao.SelectedRoutDao;
import pl.edu.wszib.projekt.domain.SelectedRout;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class SelectedRoutController {

    @Value("${app.header.select_rout}")
    private String title;


    @Autowired
    SelectedRoutDao selectedRoutDao;

    private List<SelectedRout> listRouts;

    public SelectedRoutController() {
        listRouts = generateList();
    }

    @GetMapping({"/select","/select/{rout}"})
    public String selectRoutPage(@PathVariable(required = false) String rout, Model model){

        if (!StringUtils.isEmpty(rout)){
            selectedRoutDao.save(new SelectedRout(rout,new Date()));
        }

        List<SelectedRout> routs= generateList();
        model.addAttribute("title", title);
        model.addAttribute("list", listRouts);

        return "select";
    }


    @GetMapping({"forms"})
    public String forms(Model model){

        model.addAttribute("rout",new SelectedRout());
        return "formsTemplate";
    }

    @PostMapping("formsSave")
    public String formsSave(SelectedRout selectedRout, Model model){
        listRouts.add(selectedRout);
        return "successTemplate";
    }

        private List<SelectedRout>generateList(){
        List<SelectedRout> routs = new ArrayList<>();

            SelectedRout selectedRout1 = new SelectedRout();
            selectedRout1.setRout("EX libris");
            routs.add(selectedRout1);

        SelectedRout selectedRout2 = new SelectedRout();
        selectedRout2.setRout("Zemsta");
        routs.add(selectedRout2);

        SelectedRout selectedRout3 = new SelectedRout();
        selectedRout3.setRout("Inna");
        routs.add(selectedRout3);

        return routs;

        }
    }




