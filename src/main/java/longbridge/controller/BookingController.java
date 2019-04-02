package longbridge.controller;
import longbridge.entity.Booking;
import longbridge.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class BookingController {

    @Autowired
    public BookingService bookingService;

    @GetMapping
    public String getIndexPage(Model model){
        model.addAttribute("booking",new Booking());
           return "index";


    }

    @PostMapping("/booking")
    public String book(@ModelAttribute("booking") Booking booking){
        bookingService.createBooking(booking);
        System.out.println(booking);
        return "index";
    }

}