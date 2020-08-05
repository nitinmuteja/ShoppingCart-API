package shoppingcart;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import shoppingcart.application_name.controller.ApplicationNameController;
import shoppingcart.application_name.model.ApplicationName;
import shoppingcart.application_name.repository.ApplicationNameRepository;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationNameControllerTest {

    @InjectMocks
    ApplicationNameController applicationNameController;

    @Mock
    ApplicationNameRepository applicationNameRepository;

    @Test
    public void shouldReturnApplicationName() {

        List<ApplicationName> applicationNames = new ArrayList<>();
        applicationNames.add(new ApplicationName(1, "Shopping Cart Starter"));

        when(applicationNameRepository.findAll()).thenReturn(applicationNames);

        assertThat(applicationNameController.getName(), is(new ApplicationName(1, "Shopping Cart Starter")));
    }
}
