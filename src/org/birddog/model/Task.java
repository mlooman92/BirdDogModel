/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.birddog.model;

import java.time.Duration;

/**
 *
 * @author mlooman
 */
public interface Task extends Plan {

  /**
   *Name of the <i>Task Estimated Work Elapsed Time</i> attribute<br><b>Definition:</b> Duration which indicates the expected total work to be done to complete the task.
   */
  public static final String PROP_TASK_ESTIMATED_WORK_ELAPSED_TIME = "taskEstimatedWorkElapsedTime";

  /**
   *Name of the <i>Task Actual Work Elapsed Time</i> attribute<br><b>Definition:</b> Duration which has already been expended in order to complete the task.
   */
  public static final String PROP_TASK_ACTUAL_WORK_ELAPSED_TIME = "taskActualWorkElapsedTime";

  /**
   *Getter for the {@link #PROP_TASK_ESTIMATED_WORK_ELAPSED_TIME} attribute
   * @return Duration
   */
  public Duration getTaskEstimatedWorkElapsedTime();

  /**
   *Setter for the {@link #PROP_TASK_ESTIMATED_WORK_ELAPSED_TIME} attribute
   * @param taskEstimatedWorkElapsedTime New value
   */
  public void setTaskEstimatedWorkElapsedTime(Duration taskEstimatedWorkElapsedTime);

  /**
   *Getter for the{@link #PROP_TASK_ACTUAL_WORK_ELAPSED_TIME} attribute
   * @return Duration
   */
  public Duration getTaskActualWorkElapsedTime();

  /**
   *Setter for the{@link #PROP_TASK_ACTUAL_WORK_ELAPSED_TIME} attribute
   * @param taskActualWorkElapsedTime New value
   */
  public void setTaskActualWorkElapsedTime(Duration taskActualWorkElapsedTime);
  
}
