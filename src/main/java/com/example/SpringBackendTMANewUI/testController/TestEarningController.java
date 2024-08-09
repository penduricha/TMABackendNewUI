package com.example.SpringBackendTMANewUI.testController;

import com.example.SpringBackendTMANewUI.models.Earning;
import com.example.SpringBackendTMANewUI.services.impl.EarningService;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEarningController {
    private final EarningService earningService;

    public TestEarningController(EarningService earningService) {
        this.earningService = earningService;
    }
    @RequestMapping("/postEarning")
    public String postData() throws JpaSystemException {
        Earning earning1=new Earning(1L,"Jan 1, 11 am",250);
        Earning earning2=new Earning(2L,"Jan 2, 10 am",200);
        Earning earning3=new Earning(3L,"Jan 3, 9 am",450);
        Earning earning4=new Earning(4L,"Jan 4, 8 am",400);
        Earning earning5=new Earning(5L,"Jan 5, 7 am",700);
        Earning earning6=new Earning(6L,"Jan 6, 6 am",450);
        earningService.saveEarning(earning1);
        earningService.saveEarning(earning2);
        earningService.saveEarning(earning3);
        earningService.saveEarning(earning4);
        earningService.saveEarning(earning5);
        earningService.saveEarning(earning6);
        return "Insert successfully";
    }
}
