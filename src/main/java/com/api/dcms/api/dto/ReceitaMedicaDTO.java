package com.api.dcms.api.dto;

import java.util.Date;

import org.modelmapper.ModelMapper;

import com.api.dcms.model.entity.ReceitaMedica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReceitaMedicaDTO {
    private Long idReceitaMed;
    private Long idMedico;
    private Long idPaciente;
    @DateTimeFormat(pattern="dd/MM/yyyy")
    private Date dtEmissaoReceita;
    private String prescricao;

    public static ReceitaMedicaDTO create(ReceitaMedica receitaMedica) {
        ModelMapper modelMapper = new ModelMapper();
        ReceitaMedicaDTO dto = modelMapper.map(receitaMedica, ReceitaMedicaDTO.class);
        return dto;
    }
}