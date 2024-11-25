CREATE TABLE bookings (
    id SERIAL PRIMARY KEY,
    purpose VARCHAR(255) NOT NULL,
    date_time TIMESTAMP NOT NULL
);


INSERT INTO bookings (purpose, date_time) VALUES
('Business Meeting', '2024-11-20 09:00:00'),
('Doctor Appointment', '2024-11-21 14:30:00'),
('Lunch with Client', '2024-11-22 12:00:00'),
('Project Deadline', '2024-11-23 17:00:00'),
('Conference Call', '2024-11-24 11:00:00'),
('Team Building Event', '2024-11-25 15:00:00'),
('Interview', '2024-11-26 10:00:00'),
('Workshop', '2024-11-27 09:30:00'),
('Training Session', '2024-11-28 13:00:00'),
('Networking Event', '2024-11-29 18:00:00');