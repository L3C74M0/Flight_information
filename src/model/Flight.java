package model;

public class Flight implements Comparable<Flight> {
	private String date;
	private String departureTime;
	private String airline;
	private String id;
	private String destinationCity;
	private int boardingGate;

	public Flight(String date, String departureTime, String airline, String id, String destinationCity, int boardingGate) {
		this.date = date;
		this.departureTime = departureTime;
		this.airline = airline;
		this.id = id;
		this.destinationCity = destinationCity;
		this.boardingGate = boardingGate;
	}

	public int getBoardingGate() {
		return boardingGate;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public String getId() {
		return id;
	}

	public String getAirline() {
		return airline;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getDate() {
		return date;
	}

	@Override
	public int compareTo(Flight otherFlight) {
		int compare;
		if (destinationCity.compareTo(otherFlight.destinationCity) < 0) {
			compare = -1;
		} else if (destinationCity.compareTo(otherFlight.destinationCity) > 0) {
			compare = 1;
		} else {
			compare = 0;
		}
		return compare;
	}

}
