package exercise1;

import java.util.Date;

/**
 *
 * @author Ana Teresa
 */
public class EventsBuilder implements AbstractEventsBuilder {

    Events events;

    public EventsBuilder() {
        events = new Events();

    }

    @Override
    public void createClient(Client client) throws EventsException {
        String InstitutionName = client.getInstitutionName();
        String contactTel = client.getContactTel();
        String TelDescription = client.getTelDescription();
        Person personApplying = client.getPersonApplying();
        if ((InstitutionName != null && !InstitutionName.equals(""))
                && (contactTel != null && !contactTel.equals(""))
                && (TelDescription != null && !TelDescription.equals(""))
                && (personApplying != null)) {
            events.setClient(client);
        } else {
            throw new EventsException("El cliente " + InstitutionName + " no puede ser creado");
        }
    }

    @Override
    public void createPlaceEventName(String newPlaceName) throws EventsException {
        if (newPlaceName != null && !newPlaceName.equals("")) {
            events.setPlaceEvent(newPlaceName);
        } else {
            throw new EventsException("Se requiere un nombre de lugar para realizar el evento");
        }
    }

    @Override
    public void createDate(Date date) throws EventsException {
        if (date != null) {
            events.setDate(date);
        } else {
            throw new EventsException("Se requiere una fecha para el evento");
        }
    }

    @Override
    public void createHoursAmount(int hours) throws EventsException {
        if (hours >= 1) {
            events.setHoursAmount(hours);
        } else {
            throw new EventsException("Las horas del evento deben ser mayores a cero");
        }
    }

    @Override
    public void createAttendeesAmount(int attendees) throws EventsException {
        Client client = events.getClient();
        if (attendees >= 0) {
            if (client instanceof EducationalInstitution) {

            } else {
                events.setAttendeesAmount(attendees);
            }
        } else {
            throw new EventsException("Se requiere que la cantidad de asistentes sea válida");
        }
    }

    @Override
    public Events getEvents() {
        return events;
    }

}
