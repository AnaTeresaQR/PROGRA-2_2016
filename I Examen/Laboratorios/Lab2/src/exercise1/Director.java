package exercise1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class Director {

    public Events createEvents(AbstractEventsBuilder ab,
            Client client,
            String placeEvent,
            Date date,
            int hoursAmount,
            int attendeesAmount)
            throws EventsException {

        if (ab == null) {
            ab = new EventsBuilder();
        }
        ab.createClient(client);
        ab.createPlaceEventName(placeEvent);
        ab.createDate(date);
        ab.createHoursAmount(hoursAmount);
        ab.createAttendeesAmount(attendeesAmount);

        return ab.getEvents();
    }
}
