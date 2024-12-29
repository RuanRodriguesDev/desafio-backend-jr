package br.com.autoscore.desafiobackendjr.service;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.autoscore.desafiobackendjr.dto.VeiculoDto;
import br.com.autoscore.desafiobackendjr.entity.Veiculo;
import br.com.autoscore.desafiobackendjr.repository.VeiculoRepository;
import br.com.autoscore.desafiobackendjr.service.ApiVeiculos;

@Service
public class VeiculoService {


    private ApiVeiculos apiVeiculos;
    private VeiculoRepository veiculoRepository;

    public VeiculoService(ApiVeiculos apiVeiculos, VeiculoRepository veiculoRepository) {
        this.apiVeiculos = apiVeiculos;
        this.veiculoRepository = veiculoRepository;
    }

    @SuppressWarnings("unchecked")
    public Veiculo saveVeiculo(String placa) throws Exception{
        

        VeiculoDto veiculoDto = apiVeiculos.veiculoDto(placa, placa);

        if(veiculoDto == null){
            throw new Exception("Veiculo nao encontrado!!");
        }
        Veiculo veiculoEntity = new Veiculo(
            
            0,  veiculoDto.getCpf(), 
                   veiculoDto.getProprietario(),
                   veiculoDto.getPlaca(),
                   veiculoDto.getModelo(),
                   veiculoDto.getMarca(),
                   veiculoDto.getChassi(),
                   veiculoDto.isLicenciamento()

        

        );
        return  veiculoRepository.save(veiculoEntity);
    }
    public List<Veiculo> listVeiculos(){
        return veiculoRepository.findAll();
    }

    public List<Veiculo> deleteVeiculos(Long id){
        veiculoRepository.deleteById(id);
        return listVeiculos();
    }

    public Veiculo updateVeiculo(Veiculo veiculo){
        
        return veiculoRepository.save(veiculo);
    }

    
}
