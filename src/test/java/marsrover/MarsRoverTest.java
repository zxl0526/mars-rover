package marsrover;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {
    @Test
    public void should_return_x_0_y_2_and_N_when_receive_MM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(2));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_0_and_W_when_receive_MLLMR_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MLLMR");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(0) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("W"));
    }

    @Test
    public void should_return_x_3_y_1_and_W_when_receive_MLLMR_command_give_mars_rover_with_init_place_x_2_y_1_E() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(2,1, "E"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MLLR");

        assertThat(marsRoverPosition.getCoordinatesX(), is(3));
        assertThat(marsRoverPosition.getCoordinatesY(), is(1) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_3_and_N_when_receive_MFM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MFM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(3));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_0_and_N_when_receive_MBM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MBM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(0));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_0_and_N_when_receive_MMBFM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MMBFM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(0));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_2_and_N_when_receive_MBBM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MBBM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(2));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_4_and_N_when_receive_MFMFM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MFMFM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(4));
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_0_y_1_and_W_when_receive_FL_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("FL");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(1) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("W"));
    }

    @Test
    public void should_return_x_1_y_0_and_W_when_receive_FR_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("FR");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(1) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("E"));
    }

    @Test
    public void should_return_x_0_y_1_and_W_when_receive_FBL_command_give_mars_rover_with_init_place_x_0_y_2_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0,2 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("FBL");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(1) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("W"));
    }

    @Test
    public void should_return_x_1_y_0_and_E_when_receive_FBR_command_give_mars_rover_with_init_place_x_0_y_2_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,2 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("FBR");

        assertThat(marsRoverPosition.getCoordinatesX(), is(0));
        assertThat(marsRoverPosition.getCoordinatesY(), is(1) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("E"));
    }

    @Test
    public void should_return_x_3_y_1_and_N_when_receive_MMBMLFMR_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MMBMLFMR");

        assertThat(marsRoverPosition.getCoordinatesX(), is(3));
        assertThat(marsRoverPosition.getCoordinatesY(), is(1) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_4_y_1_and_N_when_receive_MMBMLFMRM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MMBMLFMRM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(3));
        assertThat(marsRoverPosition.getCoordinatesY(), is(-1) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_3_y_f2_and_N_when_receive_MMBMLFMRMFM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MMBMLFMRMFM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(3));
        assertThat(marsRoverPosition.getCoordinatesY(), is(-2) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }

    @Test
    public void should_return_x_3_y_0_and_N_when_receive_MMBMLFMRMFMBMM_command_give_mars_rover_with_init_place_x_0_y_0_N() {
        MarsRover marsRover = new MarsRover(new MarsRoverPosition(0 ,0 , "N"));

        MarsRoverPosition marsRoverPosition = marsRover.receive("MMBMLFMRMFMBMM");

        assertThat(marsRoverPosition.getCoordinatesX(), is(3));
        assertThat(marsRoverPosition.getCoordinatesY(), is(0) );
        assertThat(marsRoverPosition.getDirectionShortName(), is("N"));
    }



}
