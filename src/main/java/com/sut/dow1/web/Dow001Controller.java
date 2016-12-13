package com.sut.dow1.web;
import com.sut.dow1.domain.Dow001;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/dow001s")
@Controller
@RooWebScaffold(path = "dow001s", formBackingObject = Dow001.class)
public class Dow001Controller {
}
