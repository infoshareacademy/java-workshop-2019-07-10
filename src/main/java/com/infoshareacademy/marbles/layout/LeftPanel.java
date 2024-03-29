package com.infoshareacademy.marbles.layout;

import com.infoshareacademy.marbles.domain.ScoreLabel;
import com.infoshareacademy.marbles.domain.ScoreValue;
import com.infoshareacademy.marbles.domain.SpaceLabel;
import com.infoshareacademy.marbles.domain.TimerLabel;
import com.infoshareacademy.marbles.domain.TimerValue;
import com.infoshareacademy.marbles.game.MarbleState;
import com.infoshareacademy.marbles.service.ButtonCreator;
import com.infoshareacademy.marbles.service.TimeHandler;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;

public class LeftPanel extends MarblesPanel {

  private Timeline timeline;

  public GridPane build(MarbleState marbleState) {

    ColumnConstraints col1 = new ColumnConstraints();
    col1.setPrefWidth(250);
    getColumnConstraints().addAll(col1);

    timeline = TimeHandler.createTimeline(marbleState);

    ButtonCreator buttonCreator = new ButtonCreator();
    Button pauseGameButton = buttonCreator.createPauseButton(marbleState, timeline);
    Button startGameButton = buttonCreator.createStartButton(marbleState, timeline);
    Button showScoresButton = buttonCreator.createShowScoresButton();

    add(ScoreLabel.getInstance(), 0, 0);
    add(ScoreValue.getInstance(marbleState), 0, 1);
    add(SpaceLabel.getInstance(), 0, 2);
    add(TimerLabel.getInstance(), 0, 3);
    add(TimerValue.getInstance(marbleState), 0, 4);
    add(SpaceLabel.getInstance(), 0, 5);
    add(startGameButton, 0, 6);
    add(SpaceLabel.getInstance(), 0, 7);
    add(pauseGameButton, 0, 8);
    add(SpaceLabel.getInstance(), 0, 9);
    add(showScoresButton, 0, 10);

    return this;
  }
}
