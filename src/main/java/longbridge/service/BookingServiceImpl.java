package longbridge.service;

import longbridge.entity.Booking;
import longbridge.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking createBooking(Booking booking) {
        Booking b = bookingRepository.save(booking);
        return b;
    }
}

