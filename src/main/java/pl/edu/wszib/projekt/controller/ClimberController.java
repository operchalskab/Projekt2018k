//package pl.edu.wszib.projekt.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import pl.edu.wszib.projekt.dao.ClimberDao;
//import pl.edu.wszib.projekt.dao.SelectedRoutDao;
//import pl.edu.wszib.projekt.domain.Climber;
//import pl.edu.wszib.projekt.domain.SelectedRout;
//
//import javax.annotation.PostConstruct;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ClimberController {
//
//@Autowired
//    ClimberDao climberDao;
//
//@Autowired
//    SelectedRoutDao selectedRoutDao;
//
//public void init() {
//    Climber climber = new Climber();
//
//    SelectedRout selectedRout1 = new SelectedRout();
//    SelectedRout selectedRout2 = new SelectedRout();
//
//    climber.setImie("Beata");
//
//    selectedRout1.setRout("EXligris");
//    selectedRout1.setCtime(3);
//
//    selectedRout2.setRout("Luz");
//    selectedRout2.setCtime(4);
//
//    List<SelectedRout> selectedRouts = new ArrayList<>();
//    selectedRouts.add(selectedRout1);
//    selectedRouts.add(selectedRout2);
//
//    climber.setSelectedRouts(selectedRouts);
//
//
//    climberDao.save(climber);
//    selectedRoutDao.save(selectedRout1);
//    selectedRoutDao.save(selectedRout2);
//
//}
//}
