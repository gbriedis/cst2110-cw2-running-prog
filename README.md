# cst2110-cw2-running-prog

![alt text](https://i.postimg.cc/LXHqwpsK/Screenshot-2021-03-24-at-7-10-56-pm.png)

## Project Goals:
- Fun runs (over 5km)
  - Fun runs take place in a park
- Half-marathons
  - Half-marathons take place at either a park or a town  
- A venue of either kind (park or town) may host many charity running events over the course of the _year_
- Each event has a specified _date and start time_
  - Each event is on a _different date_
- Each competitor can enter multiple events
  - Each competitor can only have a single entry per event
- Competitors entering half-marathon _must be 16 or over_ 
- There are no age restrictions on 5km runs

## Use Cases
1. _List event information_
- Events are identified by selecting it from a list
  - The system displays the name of the event's venue
  - The system displays the number of entries for that event
  - If the event is half-marathon – the system displays the number of water stations along the route
2. _List Venue Details_
- A venue is identified from a list
- Once a venue is selected, the system displays:
  - List of the dates
  - Start times of each running event
  - If park event is selected
    - Changing facilities available
- If there are no events taking place at the venue, the system outputs that to the administrator
3. _Search Competitor's Event Entries_
- The administraotr identifies a competitor by entering a name, or partial name
- For all the competirors that match, the system displays the competitor's name and age
- For each running event for which the competitor has an entry, the system displays the event date, along with the event number the user has been allocated for that event
- The system also outputs whether the event is a 5km, or a half-marathon

## Information
- The event/venue information will be _hard-coded_ within the program
- The user information can be _hard-coded_
- THere is no no requirements for the program to accept any input via the use cases
