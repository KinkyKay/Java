package com.company.Chapter36Internationalization;

import com.company.Chapter14JavaFXBasics.ClockPane;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class WorldClock extends BorderPane {
    // Create a subclass of BorderPane named WorldClock to contain an instance of the ClockPane class and place it in the center.
    // Create a Label to display the digit time, and place it in the bottem.
    // Use the GregorianCalendar class to obtain the current time for a specific locale and time zone.
    // Create a subclass of BorderPanel named WorldClockControl to contain an instance of WorldClock and two instances of
    // ComboBox for selecting locales and time zones.
    // Create an application named WorldClock tot display an instance of WorldClockControl

    private TimeZone timeZone = TimeZone.getTimeZone("EST");
    private Locale locale = Locale.getDefault();
    private ClockPane clock = new ClockPane(); // Still clock
    private Label lblDigitTime = new Label();

    public WorldClock() {
        setCenter(clock);
        setBottom(lblDigitTime);
        BorderPane.setAlignment(lblDigitTime, Pos.CENTER);

        EventHandler<ActionEvent> eventHandler = e -> {
            setCurrentTime(); // Set a new clock time
        };

        // Create an animation for a running clock
        Timeline animation = new Timeline(
                new KeyFrame(Duration.millis(1000),eventHandler));
            animation.setCycleCount(Timeline.INDEFINITE);
            animation.play(); // Start Animation

        // Resize the clock
        widthProperty().addListener(ov -> clock.setWidth(getWidth()));
        heightProperty().addListener(ov-> clock.setHeight(getHeight()));
    }

    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    private void setCurrentTime() {
        Calendar calendar = new GregorianCalendar(timeZone, locale);
        clock.setHour(calendar.get(Calendar.HOUR));
        clock.setMinute(calendar.get(Calendar.MINUTE));
        clock.setSecond(calendar.get(Calendar.SECOND));

        // Display digit time on the label
        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.LONG, locale);
        formatter.setTimeZone(timeZone);
        lblDigitTime.setText(formatter.format(calendar.getTime()));
    }
}
